package sample1.model;

public class Lugar {

	private String direccion; 
	private Double x,y;
	private String nombre; 
	private String descripcion;
	private TipoLugar tipo; // Jardin, Bar, beertruck , fabrica, contenedor
	private String telefono;
	private String grupo;
	
	private Boolean tieneGrowler; // si / no
	private Boolean tieneMesas; // si / no
//	private boolean tieneBotellas; // si / no
	private Boolean tieneStreaming;
	
	private String urlStreaming;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlStreaming() {
		return urlStreaming;
	}
	public void setUrlStreaming(String urlStreaming) {
		this.urlStreaming = urlStreaming;
	}
	public TipoLugar getTipo() {
		return tipo;
	}
	public void setTipo(TipoLugar tipo) {
		this.tipo = tipo;
	}
	public Boolean getTieneGrowler() {
		return tieneGrowler;
	}
	public void setTieneGrowler(Boolean tieneGrowler) {
		this.tieneGrowler = tieneGrowler;
	}
	public Boolean getTieneMesas() {
		return tieneMesas;
	}
	public void setTieneMesas(Boolean tieneMesas) {
		this.tieneMesas = tieneMesas;
	}
	public Boolean getTieneStreaming() {
		return tieneStreaming;
	}
	public void setTieneStreaming(Boolean tieneStreaming) {
		this.tieneStreaming = tieneStreaming;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
