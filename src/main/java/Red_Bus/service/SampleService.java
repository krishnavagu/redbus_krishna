/*
 * INSERT COPYRIGHT HERE
 */

package Red_Bus.service;

import Red_Bus.dao.DSampleDaoBean;
import Red_Bus.domain.DSample;
import com.wadpam.gaelic.crud.MardaoCrudService;
import net.sf.mardao.core.dao.Dao;

/**
 *
 * @author sosandstrom
 */
public class SampleService extends MardaoCrudService<DSample, Long, Dao<DSample, Long>> {

    public SampleService() {
        super(DSample.class, Long.class, DSampleDaoBean.class);
    }

}
