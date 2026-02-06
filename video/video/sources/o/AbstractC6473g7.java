package o;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.g7  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6473g7 {
    public static final b a = new b(null);

    /* renamed from: o.g7$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC6473g7 a(Context context) {
            C6562gT0.p(context, "context");
            if (C7443k7.a.a() >= 4) {
                return new a(context);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC6473g7 a(Context context) {
        return a.a(context);
    }

    public abstract Object b(RR1 rr1, HM<? super C7458kA2> hm);

    public abstract Object c(L6 l6, HM<? super C6959i7> hm);

    /* renamed from: o.g7$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6473g7 {
        public final AdSelectionManager b;

        @FV(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl", f = "AdSelectionManager.kt", i = {}, l = {92}, m = "selectAds", n = {}, s = {})
        /* renamed from: o.g7$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0280a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public int b1;

            public C0280a(HM<? super C0280a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return a.this.c(null, this);
            }
        }

        public a(AdSelectionManager adSelectionManager) {
            C6562gT0.p(adSelectionManager, "mAdSelectionManager");
            this.b = adSelectionManager;
        }

        @Override // o.AbstractC6473g7
        public Object b(RR1 rr1, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.b.reportImpression(k(rr1), new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // o.AbstractC6473g7
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object c(L6 l6, HM<? super C6959i7> hm) {
            C0280a c0280a;
            int i;
            a aVar;
            if (hm instanceof C0280a) {
                c0280a = (C0280a) hm;
                int i2 = c0280a.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0280a.b1 = i2 - Integer.MIN_VALUE;
                    Object obj = c0280a.Z0;
                    Object l = C7289jT0.l();
                    i = c0280a.b1;
                    if (i == 0) {
                        if (i == 1) {
                            aVar = (a) c0280a.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        AdSelectionConfig g = g(l6);
                        c0280a.Y0 = this;
                        c0280a.b1 = 1;
                        obj = m(g, c0280a);
                        if (obj == l) {
                            return l;
                        }
                        aVar = this;
                    }
                    return aVar.l(Z6.a(obj));
                }
            }
            c0280a = new C0280a(hm);
            Object obj2 = c0280a.Z0;
            Object l2 = C7289jT0.l();
            i = c0280a.b1;
            if (i == 0) {
            }
            return aVar.l(Z6.a(obj2));
        }

        public final AdSelectionConfig g(L6 l6) {
            AdSelectionConfig.Builder adSelectionSignals;
            AdSelectionConfig.Builder customAudienceBuyers;
            AdSelectionConfig.Builder decisionLogicUri;
            AdTechIdentifier fromString;
            AdSelectionConfig.Builder seller;
            AdSelectionConfig.Builder perBuyerSignals;
            AdSelectionConfig.Builder sellerSignals;
            AdSelectionConfig.Builder trustedScoringSignalsUri;
            AdSelectionConfig build;
            adSelectionSignals = W6.a().setAdSelectionSignals(h(l6.a()));
            customAudienceBuyers = adSelectionSignals.setCustomAudienceBuyers(i(l6.b()));
            decisionLogicUri = customAudienceBuyers.setDecisionLogicUri(l6.c());
            fromString = AdTechIdentifier.fromString(l6.e().a());
            seller = decisionLogicUri.setSeller(fromString);
            perBuyerSignals = seller.setPerBuyerSignals(j(l6.d()));
            sellerSignals = perBuyerSignals.setSellerSignals(h(l6.f()));
            trustedScoringSignalsUri = sellerSignals.setTrustedScoringSignalsUri(l6.g());
            build = trustedScoringSignalsUri.build();
            C6562gT0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        public final AdSelectionSignals h(C7200j7 c7200j7) {
            AdSelectionSignals fromString;
            fromString = AdSelectionSignals.fromString(c7200j7.a());
            C6562gT0.o(fromString, "fromString(request.signals)");
            return fromString;
        }

        public final List<AdTechIdentifier> i(List<C7686l7> list) {
            AdTechIdentifier fromString;
            ArrayList arrayList = new ArrayList();
            for (C7686l7 c7686l7 : list) {
                fromString = AdTechIdentifier.fromString(c7686l7.a());
                C6562gT0.o(fromString, "fromString(buyer.identifier)");
                arrayList.add(fromString);
            }
            return arrayList;
        }

        public final Map<AdTechIdentifier, AdSelectionSignals> j(Map<C7686l7, C7200j7> map) {
            AdTechIdentifier fromString;
            AdSelectionSignals adSelectionSignals;
            HashMap hashMap = new HashMap();
            for (C7686l7 c7686l7 : map.keySet()) {
                fromString = AdTechIdentifier.fromString(c7686l7.a());
                C6562gT0.o(fromString, "fromString(key.identifier)");
                if (map.get(c7686l7) != null) {
                    C7200j7 c7200j7 = map.get(c7686l7);
                    C6562gT0.m(c7200j7);
                    adSelectionSignals = h(c7200j7);
                } else {
                    adSelectionSignals = null;
                }
                hashMap.put(fromString, adSelectionSignals);
            }
            return hashMap;
        }

        public final ReportImpressionRequest k(RR1 rr1) {
            V6.a();
            return U6.a(rr1.b(), g(rr1.a()));
        }

        public final C6959i7 l(AdSelectionOutcome adSelectionOutcome) {
            long adSelectionId;
            Uri renderUri;
            adSelectionId = adSelectionOutcome.getAdSelectionId();
            renderUri = adSelectionOutcome.getRenderUri();
            C6562gT0.o(renderUri, "response.renderUri");
            return new C6959i7(adSelectionId, renderUri);
        }

        public final Object m(AdSelectionConfig adSelectionConfig, HM<? super AdSelectionOutcome> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.b.selectAds(adSelectionConfig, new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            return A;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context) {
            this(X6.a(r2));
            C6562gT0.p(context, "context");
            Object systemService = context.getSystemService(M6.a());
            C6562gT0.o(systemService, "context.getSystemService…:class.java\n            )");
        }
    }
}
