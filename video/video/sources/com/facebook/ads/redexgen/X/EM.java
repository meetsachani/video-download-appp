package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class EM extends UN<C4A> {
    public static String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ C4L A00;

    public EM(C4L c4l) {
        this.A00 = c4l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.UN
    /* renamed from: A00 */
    public final void A03(C4A c4a) {
        C0710Ek c0710Ek;
        C0710Ek c0710Ek2;
        int A00 = c4a.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            c0710Ek = this.A00.A0C;
            int currentPositionMS2 = c0710Ek.getDuration();
            if (A00 == currentPositionMS2) {
                c0710Ek2 = this.A00.A0C;
                int duration = c0710Ek2.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        C4L c4l = this.A00;
        if (A01[5].length() == 7) {
            throw new RuntimeException();
        }
        A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
        c4l.A0k(A00);
    }

    @Override // com.facebook.ads.redexgen.X.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
