.class public final Landroid/support/v4/widget/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Ljava/lang/reflect/Field;

.field private static b:Z


# direct methods
.method public static a(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;
    .locals 4
    .param p0, "button"    # Landroid/widget/CompoundButton;

    .line 123
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 124
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 127
    :cond_0
    sget-boolean v0, Landroid/support/v4/widget/c;->b:Z

    const-string v1, "CompoundButtonCompat"

    if-nez v0, :cond_1

    .line 129
    const/4 v0, 0x1

    :try_start_0
    const-class v2, Landroid/widget/CompoundButton;

    const-string v3, "mButtonDrawable"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Landroid/support/v4/widget/c;->a:Ljava/lang/reflect/Field;

    .line 130
    sget-object v2, Landroid/support/v4/widget/c;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    goto :goto_0

    .line 131
    :catch_0
    move-exception v2

    .line 132
    .local v2, "e":Ljava/lang/NoSuchFieldException;
    const-string v3, "Failed to retrieve mButtonDrawable field"

    invoke-static {v1, v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 134
    .end local v2    # "e":Ljava/lang/NoSuchFieldException;
    :goto_0
    sput-boolean v0, Landroid/support/v4/widget/c;->b:Z

    .line 137
    :cond_1
    sget-object v0, Landroid/support/v4/widget/c;->a:Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 139
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 140
    :catch_1
    move-exception v0

    .line 141
    .local v0, "e":Ljava/lang/IllegalAccessException;
    const-string v3, "Failed to get button drawable via reflection"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 142
    sput-object v2, Landroid/support/v4/widget/c;->a:Ljava/lang/reflect/Field;

    .line 145
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :cond_2
    return-object v2
.end method

.method public static a(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
    .locals 2
    .param p0, "button"    # Landroid/widget/CompoundButton;
    .param p1, "tint"    # Landroid/content/res/ColorStateList;

    .line 57
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 58
    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 59
    :cond_0
    instance-of v0, p0, Landroid/support/v4/widget/n;

    if-eqz v0, :cond_1

    .line 60
    move-object v0, p0

    check-cast v0, Landroid/support/v4/widget/n;

    invoke-interface {v0, p1}, Landroid/support/v4/widget/n;->setSupportButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 62
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    .locals 2
    .param p0, "button"    # Landroid/widget/CompoundButton;
    .param p1, "tintMode"    # Landroid/graphics/PorterDuff$Mode;

    .line 93
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 94
    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 95
    :cond_0
    instance-of v0, p0, Landroid/support/v4/widget/n;

    if-eqz v0, :cond_1

    .line 96
    move-object v0, p0

    check-cast v0, Landroid/support/v4/widget/n;

    invoke-interface {v0, p1}, Landroid/support/v4/widget/n;->setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 98
    :cond_1
    :goto_0
    return-void
.end method