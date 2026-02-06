package o;

import com.facebook.internal.InterfaceC2365j;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.y32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC10860y32 implements InterfaceC2365j {
    SHARE_DIALOG(com.facebook.internal.Z.n),
    PHOTOS(com.facebook.internal.Z.q),
    VIDEO(com.facebook.internal.Z.v),
    MULTIMEDIA(com.facebook.internal.Z.A),
    HASHTAG(com.facebook.internal.Z.A),
    LINK_SHARE_QUOTES(com.facebook.internal.Z.A);
    
    public final int X;

    EnumC10860y32(int i) {
        this.X = i;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC10860y32[] valuesCustom() {
        EnumC10860y32[] valuesCustom = values();
        return (EnumC10860y32[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // com.facebook.internal.InterfaceC2365j
    public int e() {
        return this.X;
    }

    @Override // com.facebook.internal.InterfaceC2365j
    @NotNull
    public String g() {
        return com.facebook.internal.Z.i0;
    }
}
