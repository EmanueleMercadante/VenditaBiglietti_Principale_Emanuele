package it.dedagroup.venditabiglietti.principal.dto.request;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEventoRequest {
	
	private LocalDate data;
	private LocalTime ora;
	private String descrizione;
	private long idManufestazione;
	private long idLuogo;
//	private List<Long> idPrezzoSettoreEvento;
	


}
