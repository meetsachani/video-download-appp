package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Tracks;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pY */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2197pY implements AnonymousClass24 {
    @MetaExoPlayerCustomization("Remove Immutable List for Oculus")
    public final List<C2198pZ> A00;
    public static String[] A01 = {"0eRTZm", "wsJdmo7HTY", "VHUY43wJh5fnSZ3wEvYR5lxV3yQqNNMU", "k8", "kUjTCgoRRteoZ0", "6rJamNQt6U89KJOuF", "xAstRHAahUkfHwQSYEnj0qzfqp", "GuXFY9846UfmIsqOXXuGkg4YoPfa8R1b"};
    public static final C2197pY A03 = new C2197pY(new ArrayList());
    public static final String A04 = C5C.A0h(0);
    public static final AnonymousClass23<C2197pY> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pb
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2197pY.A00(bundle);
        }
    };

    public C2197pY(List<C2198pZ> list) {
        this.A00 = C1840jW.A03((C2198pZ[]) list.toArray(new C2198pZ[0]));
    }

    public static /* synthetic */ C2197pY A00(Bundle bundle) {
        List<Tracks.Group> groups;
        List<Tracks.Group> groups2 = bundle.getParcelableArrayList(A04);
        if (groups2 == null) {
            groups = Collections.emptyList();
        } else {
            groups = AnonymousClass44.A01(C2198pZ.A05, groups2);
        }
        return new C2197pY(groups);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            String[] strArr = A01;
            if (strArr[2].charAt(26) != strArr[7].charAt(26)) {
                String[] strArr2 = A01;
                strArr2[0] = "oFMxQz";
                strArr2[3] = "4E";
                return false;
            }
            throw new RuntimeException();
        }
        return this.A00.equals(((C2197pY) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
