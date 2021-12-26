package ru.javaops.bootjava.util;

import ru.javaops.bootjava.error.IllegalRequestDataException;
import ru.javaops.bootjava.model.BaseEntity;

public class ValidationUtil {

    // проверяем что нам передали нового пользователя (без id)
    public static void checkNew(BaseEntity entity) {
        if (!entity.isNew()) throw new IllegalRequestDataException(
                entity.getClass().getSimpleName() + " должен быть новым (id = null)");
    }

    //  Conservative when you reply, but accept liberally (http://stackoverflow.com/a/32728226/548473)
    public static void assureIdCosistent(BaseEntity entity, int id) {
        if (entity.isNew()) entity.setId(id);
        else if (entity.getId() != id) throw new IllegalRequestDataException(
                entity.getClass().getSimpleName() + " должен иметь id = " + id);
    }
}
