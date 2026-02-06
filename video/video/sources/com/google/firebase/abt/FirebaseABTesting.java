package com.google.firebase.abt;

import android.content.Context;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public class FirebaseABTesting {
    @InterfaceC5056aJ2
    public static final String d = "com.google.firebase.abt";
    @InterfaceC5056aJ2
    public static final String e = "%s_lastKnownExperimentStartTime";
    public final Provider<AnalyticsConnector> a;
    public final String b;
    @InterfaceC11300zs1
    public Integer c = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface OriginService {
        public static final String I = "frc";
        public static final String J = "fiam";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.a = provider;
        this.b = str;
    }

    public static List<AbtExperimentInfo> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(AbtExperimentInfo.b(map));
        }
        return arrayList;
    }

    public final void a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        this.a.get().a(conditionalUserProperty);
    }

    public final void b(List<AbtExperimentInfo> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i = i();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            while (arrayDeque.size() >= i) {
                k(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).b);
            }
            AnalyticsConnector.ConditionalUserProperty i2 = abtExperimentInfo.i(this.b);
            a(i2);
            arrayDeque.offer(i2);
        }
    }

    public final boolean d(List<AbtExperimentInfo> list, AbtExperimentInfo abtExperimentInfo) {
        String c = abtExperimentInfo.c();
        String h = abtExperimentInfo.h();
        for (AbtExperimentInfo abtExperimentInfo2 : list) {
            if (abtExperimentInfo2.c().equals(c) && abtExperimentInfo2.h().equals(h)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC10697xN2
    public List<AbtExperimentInfo> e() throws AbtException {
        p();
        List<AnalyticsConnector.ConditionalUserProperty> f = f();
        ArrayList arrayList = new ArrayList();
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : f) {
            arrayList.add(AbtExperimentInfo.a(conditionalUserProperty));
        }
        return arrayList;
    }

    @InterfaceC10697xN2
    public final List<AnalyticsConnector.ConditionalUserProperty> f() {
        return this.a.get().f(this.b, "");
    }

    public final ArrayList<AbtExperimentInfo> g(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<>();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    public final ArrayList<AnalyticsConnector.ConditionalUserProperty> h(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        ArrayList<AnalyticsConnector.ConditionalUserProperty> arrayList = new ArrayList<>();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.i(this.b));
            }
        }
        return arrayList;
    }

    @InterfaceC10697xN2
    public final int i() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.a.get().e(this.b));
        }
        return this.c.intValue();
    }

    @InterfaceC10697xN2
    public void j() throws AbtException {
        p();
        l(f());
    }

    public final void k(String str) {
        this.a.get().clearConditionalUserProperty(str, null, null);
    }

    public final void l(Collection<AnalyticsConnector.ConditionalUserProperty> collection) {
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : collection) {
            k(conditionalUserProperty.b);
        }
    }

    @InterfaceC10697xN2
    public void m(List<Map<String, String>> list) throws AbtException {
        p();
        if (list != null) {
            n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    public final void n(List<AbtExperimentInfo> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<AbtExperimentInfo> e2 = e();
        l(h(e2, list));
        b(g(list, e2));
    }

    @InterfaceC10697xN2
    public void o(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        p();
        AbtExperimentInfo.k(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map<String, String> j = abtExperimentInfo.j();
        j.remove(AbtExperimentInfo.i);
        arrayList.add(AbtExperimentInfo.b(j));
        b(arrayList);
    }

    public final void p() throws AbtException {
        if (this.a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    @InterfaceC10697xN2
    public void q(List<AbtExperimentInfo> list) throws AbtException {
        p();
        l(h(e(), list));
    }
}
