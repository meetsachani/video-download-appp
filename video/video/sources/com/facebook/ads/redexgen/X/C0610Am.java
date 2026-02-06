package com.facebook.ads.redexgen.X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.annotation.DataClassGenerate;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;", "", "enableMultipleUsersPerManager", "", "enableParentViewpointVisibilityPct", "<init>", "(ZZ)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DataClassGenerate
/* renamed from: com.facebook.ads.redexgen.X.Am  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0610Am extends AbstractC1770iL {
    public static String[] A02 = {"EEiZ5gwMJpudC46gmytKirA8", "NSKRdvtre4PRehKVMd3Q45JlYfRDrG", "CoRjB0oCb37S", "DbfERFTzLjajwVv8sNh5sUlUy2oFrKFb", "LqelwWv8kaDt3gFeGdVSs3BI163sHhDb", "u6CiNkzcWrumUo8SG6zNnx5HeV2X6NdJ", "1uy0riBBBCBFhXZsG4W77pBgNTmxUCRF", "5rdIAllOhqLEYXGfwPJ9dysQ"};
    public final boolean A00;
    public final boolean A01;

    public C0610Am() {
        this(false, false, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0610Am) {
            C0610Am c0610Am = (C0610Am) obj;
            if (this.A00 != c0610Am.A00) {
                return false;
            }
            boolean z = this.A01;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[2].length()) {
                A02[3] = "cwZ0ks8a4InKRgWpKf4KlC3uRBKypiM0";
                return z == c0610Am.A01;
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        return (AbstractC1781iW.A00(this.A00) * 31) + AbstractC1781iW.A00(this.A01);
    }

    public final String toString() {
        return super.toString();
    }

    public C0610Am(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public /* synthetic */ C0610Am(boolean z, boolean z2, int i, AbstractC2257qZ abstractC2257qZ) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
