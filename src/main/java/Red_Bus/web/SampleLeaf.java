/*
 * INSERT COPYRIGHT HERE
 */

package Red_Bus.web;

import Red_Bus.domain.DSample;
import Red_Bus.json.JSample;
import Red_Bus.service.SampleService;
import com.wadpam.gaelic.converter.LongConverter;
import com.wadpam.gaelic.tree.CrudLeaf;

/**
 *
 * @author sosandstrom
 */
public class SampleLeaf extends CrudLeaf<JSample, DSample, Long, SampleService> {

    public SampleLeaf() {
        super(DSample.class, Long.class, JSample.class);
    }
    
    static class SampleConverter extends LongConverter<JSample, DSample> {

        public SampleConverter() {
            super(JSample.class, DSample.class);
        }

        @Override
        public void convertDomain(DSample from, JSample to) {
            super.convertDomain(from, to);
            to.setPhoneNumber(from.getPhoneNumber());
        }

        @Override
        public void convertJson(JSample from, DSample to) {
            super.convertJson(from, to);
            to.setPhoneNumber(from.getPhoneNumber());
        }
        
    }
}
