package ru.zalex.zkmin.web.viewmodel;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import ru.zalex.zkmin.model.Primitive;
import ru.zalex.zkmin.repository.PrimitiveRepository;

import java.util.List;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class PrimitiveVM {
    @WireVariable
    private PrimitiveRepository primitiveRepository;
    public List<Primitive> primitiveList;

    @Init
    public void init() {
        primitiveList = (List<Primitive>) primitiveRepository.findAll();
    }


    public PrimitiveRepository getPrimitiveRepository() {
        return primitiveRepository;
    }

    public void setPrimitiveRepository(PrimitiveRepository primitiveRepository) {
        this.primitiveRepository = primitiveRepository;
    }

    public List<Primitive> getPrimitiveList() {
        return primitiveList;
    }

    public void setPrimitiveList(List<Primitive> primitiveList) {
        this.primitiveList = primitiveList;
    }

}