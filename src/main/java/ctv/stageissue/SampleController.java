/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctv.stageissue;

import java.sql.ResultSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jllach
 */
@RestController
class SampleController {

    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public SampleController(JdbcTemplate jdbcTemplate) {
        Assert.notNull(jdbcTemplate, "CAN NOT BE null");
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @RequestMapping(value = "/{id}/name", method = RequestMethod.GET)
    public List<String>          get(@PathVariable("id") long id) throws Exception {
        return this.jdbcTemplate.query("SELECT CAT_IDNAME FROM DTY_CATEGORY WHERE CAT_ID = ?", new Long[] {id}, 
                                        (ResultSet rs, int rowNum) -> {
                                            return rs.getString(1);
                                        });
    }
}