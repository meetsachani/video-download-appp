package o;

import com.facebook.internal.InterfaceC2365j;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Sw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4275Sw implements InterfaceC2365j {
    SHARE_CAMERA_EFFECT(com.facebook.internal.Z.E);
    
    public final int X;

    EnumC4275Sw(int i) {
        this.X = i;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC4275Sw[] valuesCustom() {
        EnumC4275Sw[] valuesCustom = values();
        return (EnumC4275Sw[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // com.facebook.internal.InterfaceC2365j
    public int e() {
        return this.X;
    }

    @Override // com.facebook.internal.InterfaceC2365j
    @NotNull
    public String g() {
        return com.facebook.internal.Z.o0;
    }
}
