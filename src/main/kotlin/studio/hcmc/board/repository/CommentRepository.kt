package studio.hcmc.board.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import studio.hcmc.board.entity.CommentEntity

interface CommentRepository : JpaRepository<CommentEntity, Long> {
    fun findAllByArticleId(articleId: Long, pageable: Pageable): Page<CommentEntity>

    fun countAllByArticleId(articleId: Long): Long
}