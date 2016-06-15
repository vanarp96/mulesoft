
package teamsC;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Teams", targetNamespace = "http://team.ch01/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Teams {


    /**
     * 
     * @param arg0
     * @return
     *     returns teamsC.Team
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTeam", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeam")
    @ResponseWrapper(localName = "getTeamResponse", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeamResponse")
    @Action(input = "http://team.ch01/Teams/getTeamRequest", output = "http://team.ch01/Teams/getTeamResponse")
    public Team getTeam(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<teamsC.Team>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTeams", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeams")
    @ResponseWrapper(localName = "getTeamsResponse", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeamsResponse")
    @Action(input = "http://team.ch01/Teams/getTeamsRequest", output = "http://team.ch01/Teams/getTeamsResponse")
    public List<Team> getTeams();

}
