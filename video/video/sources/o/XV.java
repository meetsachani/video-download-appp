package o;

import java.util.List;

/* loaded from: classes3.dex */
public enum XV {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(VT1.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    
    public final Class<?> X;

    XV(Class cls) {
        this.X = cls;
    }

    public Class<?> e() {
        return this.X;
    }
}
