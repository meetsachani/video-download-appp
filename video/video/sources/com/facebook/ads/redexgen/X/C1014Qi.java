package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;

/* renamed from: com.facebook.ads.redexgen.X.Qi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1014Qi implements Parcelable.Creator<LinearLayoutManager$SavedState> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final LinearLayoutManager$SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager$SavedState(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final LinearLayoutManager$SavedState[] newArray(int i) {
        return new LinearLayoutManager$SavedState[i];
    }
}
