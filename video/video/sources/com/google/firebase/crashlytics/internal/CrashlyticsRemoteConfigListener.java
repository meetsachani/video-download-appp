package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.Set;
import o.C6562gT0;
import o.C8466oF;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {
    @NotNull
    public final UserMetadata a;

    public CrashlyticsRemoteConfigListener(@NotNull UserMetadata userMetadata) {
        C6562gT0.p(userMetadata, "userMetadata");
        this.a = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public void a(@NotNull RolloutsState rolloutsState) {
        C6562gT0.p(rolloutsState, RolloutAssignmentList.c);
        UserMetadata userMetadata = this.a;
        Set<RolloutAssignment> b = rolloutsState.b();
        C6562gT0.o(b, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(C8466oF.b0(b, 10));
        for (RolloutAssignment rolloutAssignment : b) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.b(rolloutAssignment.f(), rolloutAssignment.d(), rolloutAssignment.e(), rolloutAssignment.h(), rolloutAssignment.g()));
        }
        userMetadata.r(arrayList);
        Logger.f().b("Updated Crashlytics Rollout State");
    }
}
