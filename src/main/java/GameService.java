
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasun on 5/24/17.
 */
public class GameService {

    public List getAvailableTitle(GameType type){

        List titles = new ArrayList();

        if(type.equals(GameType.FPS)){
            titles.add("CS GO");
            titles.add(("Warface"));

        }else if(type.equals(GameType.MOBA)){
            titles.add("Dota 2");
            titles.add("Warcraft");

        }else if(type.equals(GameType.MMORPG)){
            titles.add("Aliens");

        }else {
            titles.add("No Game Available");
        }
        return titles;
    }
}
