package o;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;

/* renamed from: o.Pq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3963Pq2 extends AbstractC11050yq2 {
    public final TopicsManager b;

    @FV(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", i = {}, l = {22}, m = "getTopics$suspendImpl", n = {}, s = {})
    /* renamed from: o.Pq2$a */
    /* loaded from: classes.dex */
    public static final class a extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int b1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.Z0 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C3963Pq2.g(C3963Pq2.this, null, this);
        }
    }

    public C3963Pq2(TopicsManager topicsManager) {
        C6562gT0.p(topicsManager, "mTopicsManager");
        this.b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object g(C3963Pq2 c3963Pq2, C5273bD0 c5273bD0, HM<? super C5515cD0> hm) {
        a aVar;
        int i;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.b1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.Z0;
                Object l = C7289jT0.l();
                i = aVar.b1;
                if (i == 0) {
                    if (i == 1) {
                        c3963Pq2 = (C3963Pq2) aVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    GetTopicsRequest e = c3963Pq2.e(c5273bD0);
                    aVar.Y0 = c3963Pq2;
                    aVar.b1 = 1;
                    obj = c3963Pq2.h(e, aVar);
                    if (obj == l) {
                        return l;
                    }
                }
                return c3963Pq2.f(C3279Iq2.a(obj));
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.Z0;
        Object l2 = C7289jT0.l();
        i = aVar.b1;
        if (i == 0) {
        }
        return c3963Pq2.f(C3279Iq2.a(obj2));
    }

    @Override // o.AbstractC11050yq2
    public Object a(C5273bD0 c5273bD0, HM<? super C5515cD0> hm) {
        return g(this, c5273bD0, hm);
    }

    public GetTopicsRequest e(C5273bD0 c5273bD0) {
        C6562gT0.p(c5273bD0, "request");
        GetTopicsRequest a2 = C2876Eq2.a(C2680Cq2.a(C2985Fq2.a(), c5273bD0.a()));
        C6562gT0.o(a2, "Builder()\n            .s…ame)\n            .build()");
        return a2;
    }

    public final C5515cD0 f(GetTopicsResponse getTopicsResponse) {
        C6562gT0.p(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Object obj : C3377Jq2.a(getTopicsResponse)) {
            Topic a2 = C3475Kq2.a(obj);
            arrayList.add(new C10807xq2(C3573Lq2.a(a2), C3670Mq2.a(a2), C3768Nq2.a(a2)));
        }
        return new C5515cD0(arrayList);
    }

    public final Object h(GetTopicsRequest getTopicsRequest, HM<? super GetTopicsResponse> hm) {
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        C3866Oq2.a(this.b, getTopicsRequest, new D6(), C2799Dw1.a(c8883py));
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }
}
