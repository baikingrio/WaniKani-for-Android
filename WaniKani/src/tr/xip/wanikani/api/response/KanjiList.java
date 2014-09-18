package tr.xip.wanikani.api.response;

import java.util.List;

/**
 * Created by xihsa_000 on 3/13/14.
 */
public class KanjiList {
    private UserInfo user_information;
    private List<KanjiItem> requested_information;
    private Error error;

    public UserInfo getUserInfo() {
        return user_information;
    }

    public List<KanjiItem> getList() {
        return requested_information;
    }

    public Error getError() {
        return error;
    }

    public class KanjiItem extends Item {

        @Override
        public ItemType getType() {
            return ItemType.KANJI;
        }
    }
}
