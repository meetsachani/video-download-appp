package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04071z {
    public final AudioAttributes A00;

    public C04071z(C2248qQ c2248qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2248qQ.A02).setFlags(c2248qQ.A03).setUsage(c2248qQ.A05);
        if (C5C.A02 >= 29) {
            C04051x.A00(usage, c2248qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C04061y.A00(usage, c2248qQ.A04);
        }
        this.A00 = usage.build();
    }
}
