package o;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* loaded from: classes2.dex */
public final class KS2 extends UnifiedNativeAdMapper {
    public KS2(UnifiedNativeAd unifiedNativeAd) {
        z(unifiedNativeAd.k());
        B(unifiedNativeAd.n());
        v(unifiedNativeAd.i());
        A(unifiedNativeAd.e());
        w(unifiedNativeAd.j());
        u(unifiedNativeAd.h());
        H(unifiedNativeAd.f());
        I(unifiedNativeAd.m());
        G(unifiedNativeAd.l());
        O(unifiedNativeAd.g());
        F(true);
        E(true);
        P(unifiedNativeAd.d());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void J(View view, Map<String, View> map, Map<String, View> map2) {
        if (!(view instanceof zzj)) {
            if (((zze) zze.a.get(view)) == null) {
                return;
            }
            throw null;
        }
        throw null;
    }
}
