package studio.hcmc.board.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import studio.hcmc.board.entity.BoardEntity
import java.util.*

@Repository
interface BoardRepository : JpaRepository<BoardEntity, Long> {
    fun findByName(name: String): Optional<BoardEntity>
}