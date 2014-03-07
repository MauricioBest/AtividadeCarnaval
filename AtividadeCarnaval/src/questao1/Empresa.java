package questao1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nome;
	private int cnpj;
	private List<Departamento> departamentos = new ArrayList<Departamento>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cnpj;
		result = prime * result
				+ ((departamentos == null) ? 0 : departamentos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj != other.cnpj)
			return false;
		if (departamentos == null) {
			if (other.departamentos != null)
				return false;
		} else if (!departamentos.equals(other.departamentos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public void transferirFuncionario(Funcionario funcionario,Departamento destino) {
		for (int i = 0; i < departamentos.size(); i++) {
			for (int j = 0; j < departamentos.get(i).getFuncionarios().size(); j++) {
				if (departamentos.get(i).getFuncionarios().get(j) == funcionario) {
					departamentos.get(i).removeFuncionario(funcionario);
					destino.addFuncionario(funcionario);
					return;
				}
			}
		}
	}

	
	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", departamentos="
				+ departamentos + "]";
	}
	
	
	



}
