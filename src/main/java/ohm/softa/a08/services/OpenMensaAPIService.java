package ohm.softa.a08.services;

import ohm.softa.a08.api.OpenMensaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService {

	private static final OpenMensaAPIService instance = new OpenMensaAPIService();
	private final OpenMensaAPI mensaApiInstance;

	private OpenMensaAPIService() {
		Retrofit r = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("https://openmensa.org/api/v2")
			.build();

		mensaApiInstance = r.create(OpenMensaAPI.class);
	}

	public OpenMensaAPIService getInstance() {
		return instance;
	}

	public OpenMensaAPI getApi() {
		return mensaApiInstance;
	}
}
