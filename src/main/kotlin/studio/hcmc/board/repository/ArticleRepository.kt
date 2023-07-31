package studio.hcmc.board.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import studio.hcmc.board.entity.ArticleEntity

@Repository
interface ArticleRepository : JpaRepository<ArticleEntity, Long> {

}