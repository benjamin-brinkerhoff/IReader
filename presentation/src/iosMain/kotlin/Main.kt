/**
 * Main iOS entry point.
 * Delegates to IosMainViewController which hosts the full Compose Multiplatform app.
 * Swift accesses this as: MainKt.MainViewController()
 *
 * Koin must be initialised before calling this (done in AppDelegate).
 */
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController =
    ireader.presentation.IosMainViewController.MainViewController()
