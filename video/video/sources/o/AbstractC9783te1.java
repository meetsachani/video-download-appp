package o;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.te1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9783te1 {
    public static final b a = new b(null);
    public static final int b = 0;
    public static final int c = 1;

    /* renamed from: o.te1$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC9783te1 a(Context context) {
            C6562gT0.p(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C7443k7 c7443k7 = C7443k7.a;
            sb.append(c7443k7.a());
            Log.d("MeasurementManager", sb.toString());
            if (c7443k7.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC9783te1 c(Context context) {
        return a.a(context);
    }

    public abstract Object a(C6199f20 c6199f20, HM<? super C7458kA2> hm);

    public abstract Object b(HM<? super Integer> hm);

    public abstract Object d(Uri uri, InputEvent inputEvent, HM<? super C7458kA2> hm);

    public abstract Object e(Uri uri, HM<? super C7458kA2> hm);

    public abstract Object f(C5303bK2 c5303bK2, HM<? super C7458kA2> hm);

    public abstract Object g(C5788dK2 c5788dK2, HM<? super C7458kA2> hm);

    /* renamed from: o.te1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC9783te1 {
        public final MeasurementManager d;

        public a(MeasurementManager measurementManager) {
            C6562gT0.p(measurementManager, "mMeasurementManager");
            this.d = measurementManager;
        }

        @Override // o.AbstractC9783te1
        public Object a(C6199f20 c6199f20, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.d.deleteRegistrations(l(c6199f20), new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        @Override // o.AbstractC9783te1
        public Object b(HM<? super Integer> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.d.getMeasurementApiStatus(new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            return A;
        }

        @Override // o.AbstractC9783te1
        public Object d(Uri uri, InputEvent inputEvent, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.d.registerSource(uri, inputEvent, new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        @Override // o.AbstractC9783te1
        public Object e(Uri uri, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.d.registerTrigger(uri, new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        @Override // o.AbstractC9783te1
        public Object f(C5303bK2 c5303bK2, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.d.registerWebSource(n(c5303bK2), new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        @Override // o.AbstractC9783te1
        public Object g(C5788dK2 c5788dK2, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.d.registerWebTrigger(p(c5788dK2), new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        public final DeletionRequest l(C6199f20 c6199f20) {
            DeletionRequest.Builder deletionMode;
            DeletionRequest.Builder matchBehavior;
            DeletionRequest.Builder start;
            DeletionRequest.Builder end;
            DeletionRequest.Builder domainUris;
            DeletionRequest.Builder originUris;
            DeletionRequest build;
            deletionMode = C6601ge1.a().setDeletionMode(c6199f20.a());
            matchBehavior = deletionMode.setMatchBehavior(c6199f20.d());
            start = matchBehavior.setStart(c6199f20.f());
            end = start.setEnd(c6199f20.c());
            domainUris = end.setDomainUris(c6199f20.b());
            originUris = domainUris.setOriginUris(c6199f20.e());
            build = originUris.build();
            C6562gT0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        public final List<WebSourceParams> m(List<C5060aK2> list) {
            WebSourceParams.Builder debugKeyAllowed;
            WebSourceParams build;
            ArrayList arrayList = new ArrayList();
            for (C5060aK2 c5060aK2 : list) {
                C6346fe1.a();
                debugKeyAllowed = C6103ee1.a(c5060aK2.b()).setDebugKeyAllowed(c5060aK2.a());
                build = debugKeyAllowed.build();
                C6562gT0.o(build, "Builder(param.registrati…                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        public final WebSourceRegistrationRequest n(C5303bK2 c5303bK2) {
            WebSourceRegistrationRequest.Builder webDestination;
            WebSourceRegistrationRequest.Builder appDestination;
            WebSourceRegistrationRequest.Builder inputEvent;
            WebSourceRegistrationRequest.Builder verifiedDestination;
            WebSourceRegistrationRequest build;
            C7328je1.a();
            webDestination = C7087ie1.a(m(c5303bK2.f()), c5303bK2.c()).setWebDestination(c5303bK2.e());
            appDestination = webDestination.setAppDestination(c5303bK2.a());
            inputEvent = appDestination.setInputEvent(c5303bK2.b());
            verifiedDestination = inputEvent.setVerifiedDestination(c5303bK2.d());
            build = verifiedDestination.build();
            C6562gT0.o(build, "Builder(\n               …\n                .build()");
            return build;
        }

        public final List<WebTriggerParams> o(List<C5545cK2> list) {
            WebTriggerParams.Builder debugKeyAllowed;
            WebTriggerParams build;
            ArrayList arrayList = new ArrayList();
            for (C5545cK2 c5545cK2 : list) {
                C5861de1.a();
                debugKeyAllowed = C5618ce1.a(c5545cK2.b()).setDebugKeyAllowed(c5545cK2.a());
                build = debugKeyAllowed.build();
                C6562gT0.o(build, "Builder(param.registrati…                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        public final WebTriggerRegistrationRequest p(C5788dK2 c5788dK2) {
            WebTriggerRegistrationRequest build;
            C7814le1.a();
            build = C7571ke1.a(o(c5788dK2.b()), c5788dK2.a()).build();
            C6562gT0.o(build, "Builder(\n               …\n                .build()");
            return build;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context) {
            this(C4104Rd1.a(r2));
            C6562gT0.p(context, "context");
            Object systemService = context.getSystemService(C4007Qd1.a());
            C6562gT0.o(systemService, "context.getSystemService…:class.java\n            )");
        }
    }
}
