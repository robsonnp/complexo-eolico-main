package br.com.ada.letscode.monitoramentoEolico.service;

import br.com.ada.letscode.monitoramentoEolico.domain.ComplexoEolico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComplexoEolicoServiceImpl implements ComplexoEolicoService {

    private List<ComplexoEolico> list = new ArrayList<>();

    @Override
    public List<ComplexoEolico> list() {
        return list;
    }

    @Override
    public ComplexoEolico salvar(ComplexoEolico complexoEolico) {
        complexoEolico.setId(list.size() + 1L);
        list.add(complexoEolico);
        return complexoEolico;
    }

    @Override
    public ComplexoEolico getById(Long id) {
        return null;
    }

    @Override
    public ComplexoEolico delete(Long id) {
        ComplexoEolico complexoEolico = new ComplexoEolico();
        complexoEolico.setId(id);
        int index = list.indexOf(complexoEolico);
        list.remove(index);
        return null;
    }

    @Override
    public ComplexoEolico atualizar(Long id,ComplexoEolico complexoEolico) {
        complexoEolico.setId(id);
        int index = list.indexOf(complexoEolico);
        list.set(index,complexoEolico);
        return complexoEolico;
    }


}
