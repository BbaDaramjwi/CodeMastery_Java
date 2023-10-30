import keyword
import sys
import pkg_resources

installed_packages = [pkg.key for pkg in pkg_resources.working_set]
count_installed_packages = len(installed_packages)

keywords = keyword.kwlist
count_keywords = len(keyword.kwlist)

formating = "---------------------------------"

print(f"{formating} \n")

print(f" Python-Version: \n Installed {sys.version} \n")
print(f" Module: \n Installed {count_installed_packages} \n {installed_packages} \n")
print(f" Keywords: \n Usable {count_keywords} \n {keywords} \n")

print(f"{formating} \n")