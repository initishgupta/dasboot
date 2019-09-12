package com.boot;


import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;

import java.util.List;

import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

// To test spring boot application as a whole

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShipwreckRepositoryIntegrationTest {

  @Autowired
  private ShipwreckRepository shipwreckRepository;

  @Test
  public void testFindAll() {
    List<Shipwreck> wrecks = shipwreckRepository.findAll();
    assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
  }

}
