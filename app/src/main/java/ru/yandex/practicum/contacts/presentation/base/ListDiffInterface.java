package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    public boolean theSameAs (T someone);

    public boolean equals(Object obj);

}
