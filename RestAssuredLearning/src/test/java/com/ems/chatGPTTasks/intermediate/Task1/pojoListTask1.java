package com.ems.chatGPTTasks.intermediate.Task1;

import java.util.Arrays;
import java.util.List;

public class pojoListTask1 {
    List<Integer> userIds = Arrays.asList(1, 2, 3, 10);
    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }


}
