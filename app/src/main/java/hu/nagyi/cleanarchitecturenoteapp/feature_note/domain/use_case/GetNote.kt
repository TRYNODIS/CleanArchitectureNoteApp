package hu.nagyi.cleanarchitecturenoteapp.feature_note.domain.use_case

import hu.nagyi.cleanarchitecturenoteapp.feature_note.domain.model.Note
import hu.nagyi.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}