package com.google.android.exoplayer2.ui;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.exoplayer2.ui.f;
import o.HD1;
import o.InterfaceC11300zs1;

@Deprecated
/* loaded from: classes2.dex */
public final class b implements f.e {
    @InterfaceC11300zs1
    public final PendingIntent a;

    public b(@InterfaceC11300zs1 PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // com.google.android.exoplayer2.ui.f.e
    @InterfaceC11300zs1
    public CharSequence a(HD1 hd1) {
        if (!hd1.T0(18)) {
            return null;
        }
        CharSequence charSequence = hd1.s2().Y;
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        return hd1.s2().Y0;
    }

    @Override // com.google.android.exoplayer2.ui.f.e
    @InterfaceC11300zs1
    public PendingIntent b(HD1 hd1) {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.ui.f.e
    @InterfaceC11300zs1
    public Bitmap c(HD1 hd1, f.b bVar) {
        byte[] bArr;
        if (!hd1.T0(18) || (bArr = hd1.s2().e1) == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    @Override // com.google.android.exoplayer2.ui.f.e
    public CharSequence d(HD1 hd1) {
        if (!hd1.T0(18)) {
            return "";
        }
        CharSequence charSequence = hd1.s2().Z0;
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence charSequence2 = hd1.s2().X;
        if (charSequence2 == null) {
            return "";
        }
        return charSequence2;
    }
}
