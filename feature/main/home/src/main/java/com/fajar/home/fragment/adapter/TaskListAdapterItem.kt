package com.fajar.home.fragment.adapter

import com.fajar.model.Task

sealed class TaskListAdapterItem(val viewType: EnumTaskListAdapterViewType) {
    class TaskItem(val task: Task) : TaskListAdapterItem(EnumTaskListAdapterViewType.TASK)
    class EmptyItem : TaskListAdapterItem(EnumTaskListAdapterViewType.EMPTY)
}

enum class EnumTaskListAdapterViewType {
    TASK,
    EMPTY;

    companion object {
        fun getEnumByOrdinal(index: Int) : EnumTaskListAdapterViewType {
            return entries[index]
        }
    }
}