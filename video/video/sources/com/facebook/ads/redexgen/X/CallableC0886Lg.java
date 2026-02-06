package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Lg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC0886Lg implements Callable<Void> {
    public final File A00;
    public final /* synthetic */ AbstractC1921kr A01;

    public CallableC0886Lg(AbstractC1921kr abstractC1921kr, File file) {
        this.A01 = abstractC1921kr;
        this.A00 = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Void call() throws Exception {
        this.A01.A06(this.A00);
        return null;
    }
}
