package ie.wit.theyappyappy.helpers

import android.content.Intent
import androidx.activity.result.ActivityResultLauncher
import ie.wit.theyappyappy.R

fun showImagePicker(intentLauncher : ActivityResultLauncher<Intent>) {
    var chooseFile = Intent(Intent.ACTION_OPEN_DOCUMENT)
    chooseFile.type = "image/*"
    chooseFile = Intent.createChooser(chooseFile, R.string.select_walkImage.toString())
    intentLauncher.launch(chooseFile)
}