/*
 * INSERT COPYRIGHT HERE
 */

package Red_Bus.domain;

import com.wadpam.gaelic.oauth.domain.DOAuth2User;
import javax.persistence.Basic;
import javax.persistence.Entity;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DSample extends AbstractLongEntity {

    @Basic
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
