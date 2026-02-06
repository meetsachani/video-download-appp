package o;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.hT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6804hT {
    public static final b a = new b(null);

    /* renamed from: o.hT$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC6804hT a(Context context) {
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
    public static final AbstractC6804hT c(Context context) {
        return a.a(context);
    }

    public abstract Object a(C7539kV0 c7539kV0, HM<? super C7458kA2> hm);

    public abstract Object b(C7794lZ0 c7794lZ0, HM<? super C7458kA2> hm);

    /* renamed from: o.hT$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6804hT {
        public final CustomAudienceManager b;

        public a(CustomAudienceManager customAudienceManager) {
            C6562gT0.p(customAudienceManager, "customAudienceManager");
            this.b = customAudienceManager;
        }

        @Override // o.AbstractC6804hT
        public Object a(C7539kV0 c7539kV0, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.b.joinCustomAudience(k(c7539kV0), new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        @Override // o.AbstractC6804hT
        public Object b(C7794lZ0 c7794lZ0, HM<? super C7458kA2> hm) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            this.b.leaveCustomAudience(l(c7794lZ0), new D6(), C2799Dw1.a(c8883py));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        }

        public final List<AdData> g(List<C10137v6> list) {
            AdData.Builder metadata;
            AdData.Builder renderUri;
            AdData build;
            ArrayList arrayList = new ArrayList();
            for (C10137v6 c10137v6 : list) {
                metadata = YS.a().setMetadata(c10137v6.a());
                renderUri = metadata.setRenderUri(c10137v6.b());
                build = renderUri.build();
                C6562gT0.o(build, "Builder()\n              …                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        public final AdTechIdentifier h(C7686l7 c7686l7) {
            AdTechIdentifier fromString;
            fromString = AdTechIdentifier.fromString(c7686l7.a());
            C6562gT0.o(fromString, "fromString(input.identifier)");
            return fromString;
        }

        public final AdSelectionSignals i(C7200j7 c7200j7) {
            AdSelectionSignals fromString;
            if (c7200j7 != null) {
                fromString = AdSelectionSignals.fromString(c7200j7.a());
                return fromString;
            }
            return null;
        }

        public final CustomAudience j(CS cs) {
            CustomAudience.Builder activationTime;
            CustomAudience.Builder ads;
            CustomAudience.Builder biddingLogicUri;
            CustomAudience.Builder buyer;
            CustomAudience.Builder dailyUpdateUri;
            CustomAudience.Builder expirationTime;
            CustomAudience.Builder name;
            CustomAudience.Builder trustedBiddingData;
            CustomAudience.Builder userBiddingSignals;
            CustomAudience build;
            activationTime = US.a().setActivationTime(cs.a());
            ads = activationTime.setAds(g(cs.b()));
            biddingLogicUri = ads.setBiddingLogicUri(cs.c());
            buyer = biddingLogicUri.setBuyer(h(cs.d()));
            dailyUpdateUri = buyer.setDailyUpdateUri(cs.e());
            expirationTime = dailyUpdateUri.setExpirationTime(cs.f());
            name = expirationTime.setName(cs.g());
            trustedBiddingData = name.setTrustedBiddingData(m(cs.h()));
            userBiddingSignals = trustedBiddingData.setUserBiddingSignals(i(cs.i()));
            build = userBiddingSignals.build();
            C6562gT0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        public final JoinCustomAudienceRequest k(C7539kV0 c7539kV0) {
            JoinCustomAudienceRequest.Builder customAudience;
            JoinCustomAudienceRequest build;
            customAudience = WS.a().setCustomAudience(j(c7539kV0.a()));
            build = customAudience.build();
            C6562gT0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        public final LeaveCustomAudienceRequest l(C7794lZ0 c7794lZ0) {
            LeaveCustomAudienceRequest.Builder buyer;
            LeaveCustomAudienceRequest.Builder name;
            LeaveCustomAudienceRequest build;
            buyer = VS.a().setBuyer(h(c7794lZ0.a()));
            name = buyer.setName(c7794lZ0.b());
            build = name.build();
            C6562gT0.o(build, "Builder()\n              …\n                .build()");
            return build;
        }

        public final TrustedBiddingData m(Hu2 hu2) {
            TrustedBiddingData.Builder trustedBiddingKeys;
            TrustedBiddingData.Builder trustedBiddingUri;
            TrustedBiddingData build;
            if (hu2 != null) {
                trustedBiddingKeys = XS.a().setTrustedBiddingKeys(hu2.a());
                trustedBiddingUri = trustedBiddingKeys.setTrustedBiddingUri(hu2.b());
                build = trustedBiddingUri.build();
                return build;
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context) {
            this(ZS.a(r2));
            C6562gT0.p(context, "context");
            Object systemService = context.getSystemService(OS.a());
            C6562gT0.o(systemService, "context.getSystemService…:class.java\n            )");
        }
    }
}
