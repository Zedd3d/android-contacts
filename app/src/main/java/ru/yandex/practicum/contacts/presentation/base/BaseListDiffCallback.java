package ru.yandex.practicum.contacts.presentation.base;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<I extends ListDiffInterface> extends DiffUtil.ItemCallback<I> {

    @Override
    public boolean areItemsTheSame(@NonNull I oldItem, @NonNull I newItem) {
        return newItem.theSameAs(oldItem,newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull I oldItem, @NonNull I newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull I oldItem, @NonNull I newItem) {
        return newItem;
    }


}
