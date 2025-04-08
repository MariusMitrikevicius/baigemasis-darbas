package lt.mariaus.baigiamasis_darbas;

import lombok.RequiredArgsConstructor;
import lt.mariaus.baigiamasis_darbas.service.DetaleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class BaigemasisDarbasApplication {

	private final DetaleService detaleService;

	public static void main(String[] args) {
		SpringApplication.run(BaigemasisDarbasApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void insertTestData() {
//		detaleService.pridetiTestinesDetales();
//
//	}
}