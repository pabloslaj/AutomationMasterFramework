package com.pls.tests.web.base.users;

import br.com.six2six.fixturefactory.Fixture;
import com.pls.fixtures.addusers.entity.UserData;
import com.pls.pages.web.pagecomponents.adduserpage.AddUserComponent;
import lombok.Getter;

import java.util.function.BiPredicate;

@Getter
public enum AddUsersScenarioType {

    VALID(AddUsersPredicateFactory.getPredicate("valid"), Fixture.from(UserData.class).gimme("valid")),

    JUST_EMPLOYEE_NAME(AddUsersPredicateFactory.getPredicate("just_employeename"),
            Fixture.from(UserData.class).gimme("just_employeename"));

    private final BiPredicate<UserData, AddUserComponent> predicate;
    private final UserData userData;

    AddUsersScenarioType(BiPredicate<UserData, AddUserComponent> predicate, UserData userData) {
        this.predicate = predicate;
        this.userData = userData;
    }
}