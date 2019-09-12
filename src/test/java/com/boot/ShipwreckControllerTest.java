package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static  org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class ShipwreckControllerTest {

  @InjectMocks
  private ShipwreckController sc;

  @Mock
  private ShipwreckRepository shipwreckRepository;

  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testShipwreckGet() {

    Shipwreck sw = new Shipwreck();
    sw.setId(1L);

    when(shipwreckRepository.findById(1L)).thenReturn(Optional.of(sw));

    Shipwreck wreck = sc.get(1L);

    verify(shipwreckRepository).findById(1L);

    //assertEquals(1L, wreck.getId().longValue());
    assertThat(wreck.getId(), is(1L));

  }

}
