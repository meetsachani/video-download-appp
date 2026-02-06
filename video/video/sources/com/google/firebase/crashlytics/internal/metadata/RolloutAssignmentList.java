package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class RolloutAssignmentList {
    public static final String c = "rolloutsState";
    public final List<RolloutAssignment> a = new ArrayList();
    public final int b;

    public RolloutAssignmentList(int i) {
        this.b = i;
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> a() {
        List<RolloutAssignment> b = b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b.size(); i++) {
            arrayList.add(b.get(i).h());
        }
        return arrayList;
    }

    public synchronized List<RolloutAssignment> b() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public synchronized boolean c(List<RolloutAssignment> list) {
        this.a.clear();
        if (list.size() > this.b) {
            Logger f = Logger.f();
            f.m("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b);
            return this.a.addAll(list.subList(0, this.b));
        }
        return this.a.addAll(list);
    }
}
