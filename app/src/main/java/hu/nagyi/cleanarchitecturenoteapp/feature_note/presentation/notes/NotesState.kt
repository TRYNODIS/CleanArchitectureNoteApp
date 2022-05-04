package hu.nagyi.cleanarchitecturenoteapp.feature_note.presentation.notes

import hu.nagyi.cleanarchitecturenoteapp.feature_note.domain.model.Note
import hu.nagyi.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import hu.nagyi.cleanarchitecturenoteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)