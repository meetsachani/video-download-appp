package o;

import android.content.Context;

/* renamed from: o.iD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6986iD2 {
    public static final InterfaceC6986iD2 a = new a();

    /* renamed from: o.iD2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC6986iD2 {
        @Override // o.InterfaceC6986iD2
        public HJ a(b bVar, int i) {
            return null;
        }
    }

    /* renamed from: o.iD2$b */
    /* loaded from: classes.dex */
    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* renamed from: o.iD2$c */
    /* loaded from: classes.dex */
    public interface c {
        InterfaceC6986iD2 a(Context context) throws FP0;
    }

    HJ a(b bVar, int i);
}
