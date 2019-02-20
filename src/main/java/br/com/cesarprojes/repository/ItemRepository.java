package br.com.cesarprojes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesarprojes.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
