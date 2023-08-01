package studio.hcmc.board.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import studio.hcmc.board.entity.ArticleEntity

@Repository
interface ArticleRepository : JpaRepository<ArticleEntity, Long> {
    fun findAllByBoardId(boardId: Long, pageable: Pageable): Page<ArticleEntity>

    fun countAllByBoardId(boardId: Long): Long
}