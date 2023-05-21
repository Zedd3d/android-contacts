package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface<I> {
    boolean theSameAs(I oldItem, I newItem);

    boolean equals(Object object);
}
