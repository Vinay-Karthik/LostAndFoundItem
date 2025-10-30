package edu.infosys.lostAndFoundApplication.dao.impl;

import edu.infosys.lostAndFoundApplication.bean.FoundItem;
import edu.infosys.lostAndFoundApplication.dao.FoundItemDao;
import edu.infosys.lostAndFoundApplication.repository.FoundItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class FoundItemDaoImpl implements FoundItemDao {

    @Autowired
    private FoundItemRepository foundItemRepository;

    @Override
    public Long findMaxIdNumber() {
        return foundItemRepository.findMaxIdNumber();
    }

    @Override
    public FoundItem save(FoundItem foundItem) {
        return foundItemRepository.save(foundItem);
    }

    @Override
    public List<FoundItem> findAll() {
        return foundItemRepository.findAll();
    }

    @Override
    public Optional<FoundItem> findById(String id) {
        return foundItemRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        foundItemRepository.deleteById(id);
    }

    @Override
    public List<FoundItem> findByUsername(String username) {
        return foundItemRepository.findByUsername(username);
    }

	@Override
	public List<FoundItem> getTotalFoundItem() {
		return foundItemRepository.findAll();
	}
}